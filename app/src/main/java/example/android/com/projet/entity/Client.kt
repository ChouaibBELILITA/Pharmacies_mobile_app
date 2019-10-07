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




@Entity(tableName = "client")
data class Client(
    @PrimaryKey
    @ColumnInfo(name="nss")
    var nss:String,
    @ColumnInfo(name="nom")
    var nom:String="",
    @ColumnInfo(name="prenom")
    var prenom:String="",
    @ColumnInfo(name="adresse_client")
    var adresse_client:String?="",
    @ColumnInfo(name="num_tel_client")
    var num_tel_client:String?="",
    @ColumnInfo(name="motdepasse")
    var motdepasse:String?="",
    @ColumnInfo(name="log")
    var log:Int)