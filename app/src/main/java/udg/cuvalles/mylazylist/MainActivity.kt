package udg.cuvalles.mylazylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import udg.cuvalles.mylazylist.ui.theme.MyLazyListTheme

class MainActivity : ComponentActivity() {
    val personas = arrayListOf<Data>(
        Data("Juan Perez", "Programador Web", 81),
        Data("Carlos Mendez", "Programador Web", 82),
        Data("Francisco Ramirez", "Programador Web", 83),
        Data("Jesus Corona", "Programador Web", 84),
        Data("Alfonso Moran", "Programador Web", 85),
        Data("Jesus Bayardo", "Programador Web", 86),
        Data("Francisco Perez", "Programador Web", 87),
        Data("Horacio Heredia", "Programador Web", 88),
        Data("Susana Vega", "Programador Web", 89),
        Data("Juan Moran", "Programador Web", 90)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyLazyListTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column() {
                        myColum(
                            modifier = Modifier.padding(innerPadding)
                        )
                        // Mandar llamar a función de Rows
                        //myRowLazy(
                        // modifier = Modifier.padding(innerPadding)
                        //)
                    }
                }
            }
        }
    }

    @Composable
    fun myColum(modifier: Modifier = Modifier) {
        val datos01 = listOf(
            "Lunes",
            "Martes",
            "Miércoles",
            "Jueves",
            "Viernes",
            "Sábado",
            "Domingo"
        )

        LazyColumn(
            modifier = modifier
                .fillMaxWidth()
                .height(120.dp)
        ) {
            item {
                Text(text = "Personal")
            }
            items(personas) { item ->
                Card(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .background(color = MaterialTheme.colorScheme.onSecondary)
                ) {
                    // Los Text ahora están dentro del Card
                    Text(text = item.nombre)
                    Text(text = item.desription)
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyLazyListTheme {
            myColum()
            //myRowLazy()
        }
    }
}