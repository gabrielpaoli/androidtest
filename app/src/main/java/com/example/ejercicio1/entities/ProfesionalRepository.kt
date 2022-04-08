package com.example.ejercicio1.entities

class ProfesionalRepository {

    private var profesionalList : MutableList<Profesional> = mutableListOf()

    init{
        profesionalList.add(Profesional("Fulano1","Detal1"))
        profesionalList.add(Profesional("Fulano2","Detal2"))
        profesionalList.add(Profesional("Fulano3","Detal3"))
        profesionalList.add(Profesional("Fulano4","Detal4"))
        profesionalList.add(Profesional("Fulano5","Detal5"))
        profesionalList.add(Profesional("Fulano6","Detal6"))
    }

    fun getProfesionales () : MutableList<Profesional>{
        return profesionalList
    }

}