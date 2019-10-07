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

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import example.android.com.projet.entity.Client
import example.android.com.projet.retrofit.RetrofitService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main4.*
import org.jetbrains.anko.intentFor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
            confirm.setOnClickListener() {
                var passold = ""
                var numold = ""
                if (intent.hasExtra("Password")) { // vérifie qu'une valeur est associée à la clé “edittext”
                    passold = intent.getStringExtra("Password") // on récupère la valeur associée à la clé
                    numold=intent.getStringExtra("num")
                }

                passold
                numold
                if (passwordold.text.toString().isNotEmpty() && passwordnew.text.toString().isNotEmpty()  && passwordconfirm.text.toString().isNotEmpty()){
                  if (passold==passwordold.text.toString()){
                      if(passwordnew.text.toString()==passwordconfirm.text.toString()){
                          var test =   ""
                          var test1 = ""
                          var test2 =""
                          var test3 =numold
                          var test4 =""
                          var test5 = passwordnew.text.toString()
                          var test6= 2
                          var client1:Client
                          client1=Client(nss =test,nom = test1,prenom = test2,num_tel_client= test3,adresse_client= test4,motdepasse = test5,log = test6 )
                          val call= RetrofitService.endpoint.setpass(client1)

                          call.enqueue(object : Callback<String> {
                              override fun onFailure(call: Call<String>, t: Throwable) {

                                  Toast.makeText(this@Main4Activity,t.toString()+"test", Toast.LENGTH_LONG).show()

                              }

                              override fun onResponse(call: Call<String>, response: Response<String>) {
                                  if (response.isSuccessful){

                                      Toast.makeText(this@Main4Activity,"done", Toast.LENGTH_LONG).show()
                                      startActivity(intentFor<MainActivity>())

                                  }
                                  else{
                                      Toast.makeText(this@Main4Activity,"erreur", Toast.LENGTH_LONG).show()
                                  }
                              }

                          })

    }

}
                }
            }
    }
}
