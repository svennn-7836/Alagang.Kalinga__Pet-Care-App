package com.example.alagatkalinga


import android.media.Image

class DataClass {
    var dataTitle: String? = null
    var dataDesc: String? = null
    var dataPriority: String? = null
    var dataImage: String? = null
    var dataPetAge: String? = null
    var dataPetGender: String? = null
    var dataPetAllergies: String? = null
    var dataVaccination: String? = null
    var dataNeutered: String? = null
    var dataOwnerName: String? = null
    var dataOwnerAddress: String? = null
    var dataOwnerNumber: String? = null
    var dataVetName: String? = null
    var dataVetAddress: String? = null
    var dataVetNumber: String? = null
    var dataDate: String? = null // Add the dataDate field here

    constructor(dataTitle: String?, dataDesc: String?, dataPriority: String?, dataImage: String?, dataDate: String?,dataPetAge: String?,
                dataPetGender: String?, dataPetAllergies: String?, dataVaccination: String?,  dataNeutered: String?,  dataOwnerName: String?,
                dataOwnerAddress: String?, dataOwnerNumber: String?, dataVetName: String?, dataVetAddress: String?, dataVetNumber: String? ) {
        this.dataTitle = dataTitle
        this.dataDesc = dataDesc
        this.dataPriority = dataPriority
        this.dataImage = dataImage
        this.dataDate = dataDate
        this.dataPetAge = dataPetAge
        this.dataPetGender = dataPetGender
        this.dataPetAllergies = dataPetAllergies
        this.dataVaccination = dataVaccination
        this.dataNeutered = dataNeutered
        this.dataOwnerName = dataOwnerName
        this.dataOwnerAddress = dataOwnerAddress
        this.dataOwnerNumber = dataOwnerNumber
        this.dataVetName = dataVetName
        this.dataVetAddress = dataVetAddress
        this.dataVetNumber = dataVetNumber
    }

    constructor() {}
}