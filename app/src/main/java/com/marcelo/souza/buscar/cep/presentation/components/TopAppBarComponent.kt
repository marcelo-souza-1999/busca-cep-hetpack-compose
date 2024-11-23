package com.marcelo.souza.buscar.cep.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.marcelo.souza.buscar.cep.R
import com.marcelo.souza.buscar.cep.presentation.theme.CEPTheme
import com.marcelo.souza.buscar.cep.presentation.theme.TypographyTitle
import com.marcelo.souza.buscar.cep.presentation.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    title: String = ""
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                modifier = Modifier
                    .padding(start = dimensionResource(id = R.dimen.size_8))
                    .fillMaxWidth(),
                style = TypographyTitle.titleLarge
            )
        },
        modifier = Modifier.testTag("topAppBarComponent"),
        colors = TopAppBarDefaults.largeTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = White
        )
    )
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
internal fun PreviewTopAppBar() {
    CEPTheme {
        TopAppBar("Buscar Cep")
    }
}