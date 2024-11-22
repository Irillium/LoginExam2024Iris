package edu.iesam.loginexam1eval.features.user.domain

interface UserRepository {
    fun getById(id:String):User?
}