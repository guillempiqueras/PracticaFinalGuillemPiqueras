package cat.copernic.guillem.piqueras

import android.app.ActionBar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import cat.copernic.guillem.piqueras.databinding.FragmentABinding


class FragmentA : Fragment() {
    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentABinding.inflate(inflater,container, false)
        val view = binding.root
        return view

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button1.setOnClickListener(){
            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
        }
        binding.button2.setOnClickListener(){
            findNavController().navigate(R.id.action_fragmentA_to_fragmentC)
        }
    }
}