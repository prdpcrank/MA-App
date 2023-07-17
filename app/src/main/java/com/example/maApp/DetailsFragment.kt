package com.example.maApp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.maApp.timerService.BroadcastService
import com.example.maApp.databinding.FragmentDetailsBinding
import com.example.maApp.domain.entity.HomePageItemEntity
import com.example.maApp.viewmodel.NasaViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding
    private val nasaViewModel: NasaViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id: Int? = arguments?.getInt("id")
        setObserver()
        if (id != null) {
            initialiseList(id)
        }
    }

    private fun initialiseList(id: Int) {
        nasaViewModel.getDetailsData(id)
    }

    private fun setObserver() {
        requireActivity().startService(Intent(requireContext(), BroadcastService::class.java))
        nasaViewModel.nasaLiveDetailsData.observe(viewLifecycleOwner, Observer {
            val data: HomePageItemEntity? = it?.data
            setData(data)
        })
    }

    private fun setData(data: HomePageItemEntity?) {
        val options: RequestOptions = RequestOptions()
            .centerCrop()
            .placeholder(R.drawable.progress_animation)
            .error(R.drawable.ic_error)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .priority(Priority.HIGH)
            .dontAnimate()
            .dontTransform()
        Glide.with(NasaApplication.INSTANCE.applicationContext)
            .load(data?.avatar)
            .apply(options)
            .into(binding.gridImageIV)
        binding.tvName.text = data?.firstName + " " + data?.lastName
        binding.tvMail.text = data?.email
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailsBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
        }
        return binding.root
    }

    private val br: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            updateGUI(intent) // or whatever method used to update your GUI fields
        }
    }

    override fun onResume() {
        super.onResume()
        requireActivity().registerReceiver(br, IntentFilter(BroadcastService.COUNTDOWN_BR))
    }

    override fun onPause() {
        super.onPause()
        requireActivity().unregisterReceiver(br)
    }

    override fun onStop() {
        try {
            requireActivity().unregisterReceiver(br)
        } catch (ex: Exception) {
        }
        super.onStop()
    }

    override fun onDestroy() {
        requireActivity().unregisterReceiver(br)
        requireActivity().stopService(Intent(requireContext(), BroadcastService::class.java))
        super.onDestroy()
    }

    private fun updateGUI(intent: Intent) {
        if (intent.extras != null) {
            val millisUntilFinished = intent.getLongExtra("countdown", 0)
            val isDone = intent.getBooleanExtra("done", false)
            if (isDone) {
                findNavController().navigate(R.id.action_detailsFragment_to_homeFragment)
            } else {
                binding.tvText.text = "Closing Screen in: $millisUntilFinished seconds"
            }
        }
    }


}