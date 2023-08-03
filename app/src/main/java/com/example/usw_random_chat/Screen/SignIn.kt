package com.example.usw_random_chat.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.usw_random_chat.R




@Composable
fun SignInScreen() {
    LoginTextField()
    OnLoginBtn()
    OnLoginFindIdAndPassword()
    MadeAccountText()
    OnSignInBtn()
    OnLoginImage()
    LogInTextTitle()
}
@Composable
fun OnLoginImage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 63.dp),
        contentAlignment = Alignment.TopEnd
    ){
        Image(
            painter = painterResource(id = R.drawable.talkballoon),
            contentDescription = "image description",
            modifier = Modifier
                .width(286.dp)
                .height(268.dp),
            alignment = Alignment.TopEnd
        )
    }
}

@Composable
fun LogInTextTitle(){
    val customFont = Font(R.font.kcc_chassam)
    Text(
        text = "티키타카를 원해?",
        color = Color(0xFF698AFF),
        style = TextStyle(
            fontSize = 36.sp,
            fontFamily = FontFamily(customFont)
        ),
        modifier = Modifier
            .padding(
                top = 134.dp,
                start = 32.dp
            )
    )
    Text(
        text = "수원대학교 친구들과 사이좋게 소통해보자",
        color = Color(0xFF111111),
        style = TextStyle(
            fontSize = 24.sp,
            fontFamily = FontFamily(customFont)
        ),
        modifier = Modifier
            .padding(
                top = 197.dp,
                start = 32.dp
            )
            .width(188.dp)
    )
}


@Composable
fun LoginTextField() {
    var password by rememberSaveable { mutableStateOf("") }
    var text by rememberSaveable { mutableStateOf("") }
    val customFont = Font(R.font.pretendard_regular)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 365.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            placeholder = {
                Text(
                    text = "ID",
                    color = Color(0xFF989898),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(customFont)
                    )
                )
            },
            modifier = Modifier
                .width(326.dp)
                .height(48.dp)
                .background(
                    color = Color.Transparent,
                    shape = RoundedCornerShape(10.dp)
                )
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = {
                Text(
                    text = "PASSWORD",
                    color = Color(0xFF989898),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(customFont)
                    )
                )
            },
            modifier = Modifier
                .width(326.dp)
                .background(
                    color = Color.Transparent,
                    shape = RoundedCornerShape(10.dp)
                )
                .height(48.dp),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        )
    }
}

@Composable
fun OnLoginBtn() {
    val customFont = Font(R.font.pretendard_regular)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 491.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Button(
            onClick = { /* Do something */ },
            modifier = Modifier
                .height(56.dp)
                .background(
                    color = Color.Transparent,
                    shape = RoundedCornerShape(10.dp)
                )
                .width(326.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF2D64D8))
        ) {
            Text(
                "로그인",
                fontSize = 18.sp,
                color = Color.White,
                style = TextStyle(
                    fontFamily = FontFamily(customFont)
                )
            )
        }
    }
}

@Composable
fun OnLoginFindIdAndPassword() {
    val customFont = Font(R.font.pretendard_regular)

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 544.dp
            ),
        horizontalArrangement = Arrangement.Center
    ) {
        TextButton(
            onClick = {}
        ) {
            Text(
                text = "아이디 찾기",
                color = Color(0xFF232323),
                style = TextStyle(
                    fontFamily = FontFamily(customFont)
                )
            )
        }
        Spacer(
            modifier = Modifier
                .width(7.dp)
        )
        Text(
            text = "/",
            modifier = Modifier
                .padding(
                    top = 15.dp
                ),
            color = Color(0xFFBFBFBF),
            style = TextStyle(
                fontFamily = FontFamily(customFont)
            )
        )

        Spacer(
            modifier = Modifier
                .width(7.dp)
        )
        TextButton(
            onClick = {}
        ) {
            Text(
                text = "비밀번호 찾기",
                color = Color(0xFF232323),
                style = TextStyle(
                    fontFamily = FontFamily(customFont)
                )
            )
        }
    }
}


@Composable
fun MadeAccountText() {
    val customFont = Font(R.font.pretendard_regular)

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 610.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Divider(
            color = Color(0xFFBFBFBF),
            thickness = 1.dp,
            modifier = Modifier
                .width(105.dp)
                .padding(
                    top = 8.dp,
                    end = 20.dp
                )
        )
        Text(
            text = "계정이 없으신가요?",
            style = TextStyle(
                fontFamily = FontFamily(customFont)
            )
            )
        Divider(
            color = Color(0xFFBFBFBF),
            thickness = 1.dp,
            modifier = Modifier
                .width(105.dp)
                .padding(
                    top = 8.dp,
                    start = 20.dp
                )
        )
    }
}

@Composable
fun OnSignInBtn() {
    val customFont = Font(R.font.pretendard_regular)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 647.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Button(
            onClick = { /* Do something */ },
            modifier = Modifier
                .height(56.dp)
                .background(
                    color = Color.Transparent,
                    shape = RoundedCornerShape(10.dp)
                )
                .width(326.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF111111))
        ) {
            Text(
                "회원가입",
                fontSize = 18.sp,
                color = Color.White,
                style = TextStyle(
                    fontFamily = FontFamily(customFont)
                )
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SignInScreenPreview() {
    LoginTextField()
    OnLoginBtn()
    OnLoginFindIdAndPassword()
    MadeAccountText()
    OnSignInBtn()
    OnLoginImage()
    LogInTextTitle()
}


@Preview(showBackground = true)
@Composable
fun LoginTextFieldPreview() {
    LoginTextField()
}


@Preview(showBackground = true)
@Composable
fun OnLoginBtnPreview() {
    OnLoginBtn()
}


@Preview(showBackground = true)
@Composable
fun OnLoginFindIdAndPasswordPreview() {
    OnLoginFindIdAndPassword()
}

@Preview(showBackground = true)
@Composable
fun MadeAccountTextPreview() {
    MadeAccountText()
}


@Preview(showBackground = true)
@Composable
fun OnSignInBtnPreview() {
    OnSignInBtn()
}

@Preview(showBackground = true)
@Composable
fun LogInTextTitlePreview() {
    LogInTextTitle()
}


@Preview(showBackground = true)
@Composable
fun OnLoginImagePreview() {
    OnLoginImage()
}