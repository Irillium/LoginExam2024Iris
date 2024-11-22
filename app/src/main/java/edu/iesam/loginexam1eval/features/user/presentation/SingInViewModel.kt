package edu.iesam.loginexam1eval.features.user.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.iesam.loginexam1eval.features.user.domain.GetUserUseCase
import edu.iesam.loginexam1eval.features.user.domain.User
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class SingInViewModel(private val getUserUseCase: GetUserUseCase):ViewModel() {
    private val _uiState=MutableLiveData<UiState>()
    private val uiState:LiveData<UiState>=_uiState



    data class UiState(
        val user: User?=null,
        val error:String?=null
    )
}