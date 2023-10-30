package com.example.project_laundry.ROOM

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("TB_antriancuci")
data class Laundry(
    @PrimaryKey (autoGenerate = true)
    val idcuci : Int,
    @ColumnInfo(name = "Nama")
    val namacuci: String,
    @ColumnInfo (name = "No_Hp")
    val No : Int,
    @ColumnInfo (name = "Berat")
    val berat : String,
    @ColumnInfo (name = "detail")
    val Detail : String,
    @ColumnInfo (name = "pewangi")
    val Varian : String
)