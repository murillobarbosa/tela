package br.senai.sp.jandira.profile_screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import br.senai.sp.jandira.profile_screen.ui.theme.Profile_screenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Profile_screenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    stringResource(id = R.string.profile),
                    fontSize = 20.sp,
                    textAlign = TextAlign.End,
                    color = Color(66, 61, 61),
                    fontWeight = FontWeight.ExtraBold
                )

            }
        }

        Spacer(modifier = Modifier.height(15.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Box() {
                Card(
                    modifier = Modifier.size(100.dp),
                    shape = CircleShape,
                    border = BorderStroke(3.5.dp, Color(182, 182, 246))

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.perfil_bebe),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.baseline_add_circle_24),
                    contentDescription = null,
                    modifier = Modifier.align(Alignment.BottomEnd)
                )

            }

        }

        Spacer(modifier = Modifier.height(10.dp))
        Column(modifier = Modifier
            .fillMaxWidth()
           ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(stringResource(id = R.string.profile_user))
            }
        }



        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {

            comp(textoHeader = "180CM", textoMain = "Altura")

            comp(textoHeader = "180KG", textoMain = "Peso")

            comp(textoHeader = "18", textoMain = "Idade")

        }
        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier.size(width = 350.dp, height = 120.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        modifier = Modifier.padding(top = 10.dp, start = 15.dp),
                        text = stringResource(id = R.string.accont_user),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )

                }
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, start = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {

                    Row () {

                        Image(
                            painter = painterResource(id = R.drawable.baseline_person_outline_24),
                            contentDescription = null
                        )
                        Text(
                            modifier = Modifier.padding(start = 15.dp),
                            text = stringResource(id = R.string.data)
                        )

                    }

                    Row {

                        Image(
                            painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                            contentDescription = null
                        )

                    }


                }
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, start = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween){
                    Row () {

                        Image(
                            painter = painterResource(id = R.drawable.graph),
                            contentDescription = null
                        )
                        Text(
                            modifier = Modifier.padding(start = 15.dp),
                            text = stringResource(id = R.string.historic_query)
                        )

                    }
                    Row {

                        Image(
                            painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                            contentDescription = null
                        )

                    }
                }



            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Card(
                modifier = Modifier.size(width = 350.dp, height = 90.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        modifier = Modifier.padding(top = 10.dp, start = 15.dp),
                        text = stringResource(id = R.string.notification),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, start = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row () {

                        Image(
                            painter = painterResource(id = R.drawable.bell),
                            contentDescription = null
                        )
                        Text(
                            modifier = Modifier.padding(start = 15.dp),
                            text = stringResource(id = R.string.notification_pop)
                        )

                    }

                    var switchCheckedState by remember { mutableStateOf(false) }

                    Switch(
                        modifier = Modifier.padding(bottom = 20.dp),
                        checked = switchCheckedState,
                        onCheckedChange = {
                            switchCheckedState = it

                            if (it) {
                                // Código para quando o Switch estiver ligado
                            } else {
                                // Código para quando o Switch estiver desligado
                            }
                        },

                        colors = SwitchDefaults.colors(
                            checkedThumbColor = if (switchCheckedState)
                                Color(182,182,246) else Color(217,217,217),
                            checkedTrackColor = Color(182,182,246,51),
                            checkedBorderColor = Color(182,182,246),
                            uncheckedThumbColor = Color(217, 217, 217),
                            uncheckedTrackColor = Color.White,
                            disabledCheckedBorderColor = Color(182,182,246))

                        )



                }
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Card(
                modifier = Modifier.size(width = 350.dp, height = 140.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        modifier = Modifier.padding(top = 10.dp, start = 15.dp),
                        text = stringResource(id = R.string.others),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, start = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row () {

                        Image(
                            painter = painterResource(id = R.drawable.letter),
                            contentDescription = null
                        )
                        Text(
                            modifier = Modifier.padding(start = 15.dp),
                            text = stringResource(id = R.string.contact)
                        )

                    }


                    Row {

                        Image(
                            painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                            contentDescription = null
                        )

                    }


                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, start = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row () {

                        Image(
                            painter = painterResource(id = R.drawable.verification),
                            contentDescription = null
                        )
                        Text(
                            modifier = Modifier.padding(start = 15.dp),
                            text = stringResource(id = R.string.politic)
                        )

                    }

                }



            }
        }


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Profile_screenTheme {
        Greeting("Android")
    }
}