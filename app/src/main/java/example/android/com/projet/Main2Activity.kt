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

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_main2.*

import example.android.com.projet.entity.Client
import example.android.com.projet.retrofit.RetrofitService
import org.jetbrains.anko.intentFor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Math


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
                signUpBtn.setOnClickListener() {

                    if (nss.text.toString().isNotEmpty() && nom.text.toString().isNotEmpty() && prenom.text.toString().isNotEmpty() && mobileNumber.text.toString().isNotEmpty() && location.text.toString().isNotEmpty()  ){
                        var test =   nss.text.toString()
                        var test1 = nom.text.toString()
                        var test2 =prenom.text.toString()
                        var test3 =mobileNumber.text.toString()
                        var test4 =location.text.toString()
                        var alea: Double = Math.random()
                        var test5 = (alea*100000000).toInt().toString()
                        var test6=0
                        var client1:Client
                        client1=Client(nss =test,nom = test1,prenom = test2,num_tel_client= test3,adresse_client= test4,motdepasse = test5 ,log=test6)

                        val call= RetrofitService.endpoint.Register(client1)

                        call.enqueue(object : Callback<String> {
                            override fun onFailure(call: Call<String>, t: Throwable) {

                                Toast.makeText(this@Main2Activity,t.toString()+"test", Toast.LENGTH_LONG).show()

                            }

                            override fun onResponse(call: Call<String>, response: Response<String>) {
                                if (response.isSuccessful){

                                    Toast.makeText(this@Main2Activity,"ajouté avec succes, entrez vos cordonnes pour continuez", Toast.LENGTH_LONG).show()
                                    startActivity(intentFor<MainActivity>())

                                }
                                else{
                                    Toast.makeText(this@Main2Activity,"erreur", Toast.LENGTH_LONG).show()
                                }
                            }







                        })
                    }

                }
        }

    }


