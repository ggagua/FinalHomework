package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation

class FirstFragment: Fragment(R.layout.fragment_first){
    private lateinit var amountEditText: EditText
    private lateinit var sendButton: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        amountEditText = view.findViewById(R.id.numberEditTxt)
        sendButton = view.findViewById(R.id.sendBtn)

        val navController = Navigation.findNavController(view)

        sendButton.setOnClickListener{
           val amount = amountEditText.text.toString()

            if (amount.isEmpty()){
                return@setOnClickListener
            }

            val amount2 = amount.toInt()

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(amount2)

            navController.navigate(action)
        }
    }
}




