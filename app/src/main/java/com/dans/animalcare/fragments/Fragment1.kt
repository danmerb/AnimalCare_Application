package com.dans.animalcare.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.dans.animalcare.viewModels.ViewModelRoom

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Fragment1 : Fragment() {
    lateinit var viewModel: ViewModelRoom

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(com.dans.animalcare.R.layout.fragment_especie_slide, container, false)





/*      getActivity().apply {

    intent.putExtra("Key", 1)
         startActivity(intent)

        viewModel = ViewModelProviders.of(this@Fragment1).get(ViewModelRoom::class.java)
         viewModel.getFragmento(1)
*/
        return view
    }
}