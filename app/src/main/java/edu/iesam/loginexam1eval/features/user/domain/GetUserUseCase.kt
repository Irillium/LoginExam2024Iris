package edu.iesam.loginexam1eval.features.user.domain

import org.koin.core.annotation.Single

@Single
class GetUserUseCase (private val userRepository: UserRepository){
    fun invoke(id:String):User?{
        return userRepository.getById(id)
    }
}