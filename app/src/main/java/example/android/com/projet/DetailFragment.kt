/*
 * Copyright September20.2019 ChouaibBELILITA. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package example.android.com.projet


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import example.android.com.projet.entity.Pharmacie
import example.android.com.projet.viewmodel.PharmacieModel
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_detail, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //var token=getSharedPreferences("numtext", Context.MODE_PRIVATE)
        var token = this.getActivity()?.getSharedPreferences("numtext", Context.MODE_PRIVATE)
        val idPharmacie = arguments?.getInt("id")
        val pharmacieModel = ViewModelProviders.of(this).get(PharmacieModel::class.java)
        if (pharmacieModel.pharmacie!=null) {
            pharmacieModel.displayDatail(activity!!,pharmacieModel.pharmacie!!)
        }
        else {
            pharmacieModel.loadDetail(activity!!,idPharmacie!!)
        }

        commande.setOnClickListener {
            if(token!!.getString("loginusername"," ")!=" "){
                val idpharmacie = idPharmacie!!
                var intent=Intent(activity!!,Main3Activity::class.java)
                intent.putExtra("idpharmacie", idpharmacie.toString())
                startActivity(intent)


            } else {
                Toast.makeText(activity,"Vous devez connecter pour continuer", Toast.LENGTH_LONG).show()
                val idpharmacie = idPharmacie!!
                val intent = Intent(activity, MainActivity::class.java)
                intent.putExtra("idpharmacie", idpharmacie.toString())
                startActivity(intent)
            }




        }
    }

}
