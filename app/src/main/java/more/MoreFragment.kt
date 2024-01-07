package more

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import az.com.sheki.R
import kotlinx.collections.immutable.persistentListOf

class MoreFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            val menusItems = persistentListOf(
                Pair(R.drawable.ic_tourism, R.string.title_tourism),
                Pair(R.drawable.metbex, R.string.title_kitchen),
            )
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                LazyVerticalGrid(
                    modifier = Modifier.fillMaxSize(),
                    columns = GridCells.Fixed(2)
                ) {
                    items(menusItems) { menuItem ->
                        MenuItem(
                            menuIcon = menuItem.first,
                            menuName = menuItem.second,
                            onClick = { menuName ->
                                handleClickEvent(menuName)
                            }
                        )
                    }
                }
            }
        }
    }

    private fun handleClickEvent(@StringRes menuName: Int) {
        when(menuName) {
            R.string.title_tourism -> {
                findNavController().navigate(R.id.navigation_tourism)
            }
            R.string.title_kitchen -> {
                findNavController().navigate(R.id.navigation_kitchen)
            }
        }
    }
}

@Composable
internal fun MenuItem(
    modifier: Modifier = Modifier,
    @DrawableRes menuIcon: Int,
    @StringRes menuName: Int,
    onClick: (Int) -> Unit
) {
    Card(
        modifier = modifier
            .padding(12.dp)
            .clickable { onClick(menuName) },
        elevation = CardDefaults.cardElevation()
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.size(100.dp),
                painter = painterResource(id = menuIcon), contentDescription = null)
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(id = menuName),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
private fun MenuItemPreview() {
    MenuItem(
        menuIcon = R.drawable.administration,
        menuName = R.string.app_name,
        onClick = { }
    )
}