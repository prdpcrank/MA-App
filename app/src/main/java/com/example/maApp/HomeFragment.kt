package com.example.maApp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.maApp.action.ActionPerformer
import com.example.maApp.action.MaAppAction
import com.example.maApp.action.openImageInHD
import com.example.maApp.adapter.MaAppDataAdapter
import com.example.maApp.databinding.FragmentHomeBinding
import com.example.maApp.domain.entity.HomePageItemEntity
import com.example.maApp.room.DbRepository
import com.example.maApp.viewmodel.NasaViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment(), ActionPerformer<MaAppAction> {

    private lateinit var binding: FragmentHomeBinding

    private lateinit var adapter: MaAppDataAdapter

    @Inject
    lateinit var  repository: DbRepository

    private val nasaViewModel: NasaViewModel by activityViewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
        setUpObserver()
    }

    private fun setRecyclerView() {
        adapter = MaAppDataAdapter(this)
        binding.nasaRV.adapter = adapter
    }

    private fun setUpObserver() {
        val data:MutableList<HomePageItemEntity> = repository.getAllNotes()
        if(data.isNotEmpty()){
            adapter.setData(data)
        }

        nasaViewModel.nasaLiveData.observe(viewLifecycleOwner, Observer { it ->
           if(it!=null) {
               val list: MutableList<HomePageItemEntity> = mutableListOf()
               it.let { it1 -> list.addAll(it1) }
               adapter.setData(list)
               list.map { it1 ->
                   repository.saveNote(it1)
               }
           }
        })

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
        }

        return binding.root
    }

    override fun performAction(action: MaAppAction) {

        when (action) {
            is openImageInHD -> {
                openDetailsFragment(action.id)
            }
        }
    }

    private fun openDetailsFragment(uuid: Int?) {
        val bundle = Bundle()
        if (uuid != null) {
            bundle.putInt("id", uuid)
        }
        findNavController().navigate(R.id.action_homeFragment_to_detailsFragment, bundle)
    }

}



