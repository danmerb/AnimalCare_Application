package com.dans.animalcare.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dans.animalcare.activities.MainActivity
import kotlinx.android.synthetic.main.fragment_fragment_logo.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [fragment_logo.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [fragment_logo.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class fragment_logo : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?  {
        val view = inflater.inflate(com.dans.animalcare.R.layout.fragment_fragment_logo, container, false)

        view.btnIniciar.setOnClickListener {
            val intent = Intent(getActivity(), MainActivity::class.java)
            startActivity(intent)


        }
        return view
    }
}






