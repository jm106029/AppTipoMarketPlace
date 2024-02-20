package com.rm.appcomprayventa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rm.appcomprayventa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.BottomNV.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.Item_Inicio->{
                    true
                }
                R.id.Item_Chats->{
                    true
                }
                R.id.Item_Mis_Anuncios->{
                    true
                }
                R.id.Item_Cuenta->{
                    true
                }


                
            }
        }






    }
}