package com.example.ejercicio1.entities

class ProfesionalRepository {

    private var profesionalList : MutableList<Profesional> = mutableListOf()
    private lateinit var profesional : Profesional

    init{
        profesionalList.add(Profesional(0,"Fulano1","Detal1"))
        profesionalList.add(Profesional(1,"Fulano2","Detal2"))
        profesionalList.add(Profesional(2,"Fulano3","Detal3"))
        profesionalList.add(Profesional(3,"Fulano4","Detal4"))
        profesionalList.add(Profesional(4,"Fulano5","Detal5"))
        profesionalList.add(Profesional(5,"Fulano6","Detal6"))
    }

    fun getProfesionales () : MutableList<Profesional>{
        return profesionalList
    }

    fun getProfesionalePerIndex (index: Int) : Profesional{
        return profesionalList[index]
    }
}