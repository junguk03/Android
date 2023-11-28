package com.example.usw_random_chat.presentation.ViewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.usw_random_chat.data.dto.UserDTO
import com.example.usw_random_chat.domain.usecase.SignInUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(private val signInUseCase: SignInUseCase) : ViewModel() {

    private val _id = mutableStateOf("")
    private val _password = mutableStateOf("")

    val Id : State<String> = _id
    val Password : State<String>  = _password

    fun postSignIn(){
        viewModelScope.launch {//viewModelScope 공부하기
            signInUseCase.excute(UserDTO(Id.value,Password.value))
        }
    }
}