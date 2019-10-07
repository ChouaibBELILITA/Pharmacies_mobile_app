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

package example.android.com.projet.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey




@Entity(tableName = "pharmacie")
data class Pharmacie(
    @PrimaryKey
    @ColumnInfo(name="id_pharmacie")
    var id_pharmacie:Int,
    @ColumnInfo(name="nom_pharmacie")
    var nom_pharmacie:String="",
    @ColumnInfo(name="adresse_pharmacie")
    var adresse_pharmacie:String="",
    @ColumnInfo(name="heure_ouverture")
    var heure_ouverture:String="",
    @ColumnInfo(name="heure_fermeture")
    var heure_fermeture:String?="",
    @ColumnInfo(name="num_tel_pharmacie")
    var num_tel_pharmacie:String?="",
    @ColumnInfo(name="convention")
    var convention:String,
    @ColumnInfo(name="lien_fb")
    var lien_fb:String,
    @ColumnInfo(name="lien_localisation")
    var lien_localisation:String,
    @ColumnInfo(name="ville")
    var ville:String,
    @ColumnInfo(name="Garde")
    var Garde:Int,
    @ColumnInfo(name="longitude")
    var longitude:Double,
    @ColumnInfo(name="latitude")
    var latitude:Double)