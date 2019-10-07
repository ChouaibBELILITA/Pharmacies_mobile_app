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

package example.android.com.projet.roomdao
import androidx.room.*
import example.android.com.projet.entity.Pharmacie
@Dao
interface PharmacieDao {

    @Query("select * from Pharmacie")
    fun getpharmacies():List<Pharmacie>

    @Query("select * from Pharmacie where ville=:ville")
    fun getPharmaciesByVille(ville:String):List<Pharmacie>

    @Query("select * from Pharmacie where id_pharmacie=:id_pharmacie")
    fun getPharmacieById(id_pharmacie:Int):Pharmacie

    @Insert
    fun addPharmacies(pharmacies:List<Pharmacie>)

    @Update
    fun updatePharmacie(pharmacie: Pharmacie)
}
