package com.example.openinapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.openinapp.ui.theme.OpeninappTheme


@Composable
fun Openinapp() {
    // Box-1:2186-Dashboard
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff))
            .size(360.dp, 1641.dp)
            .clipToBounds(),
    ) {
        // Box-1:2187-Navbar
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .background(Color(0xff0e6fff))
                .size(360.dp, 124.dp),
        ) {
            // Row-I1:2187;951:40416-Frame 7
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 85.dp, alignment = Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .wrapContentHeight()
                    .offset(x = 16.dp, y = 40.dp)
                    .width(328.dp),
            ) {
                // Text-I1:2187;951:40417-Dashboard
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize(),
                    text = "Dashboard",
                    color = Color(0xffffffff),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Left,
                    overflow = TextOverflow.Ellipsis,
                )
                // Image-I1:2187;951:40418-Frame 7
                Image(
                    painter = painterResource(id = R.drawable.media),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize(),
                )
            }
        }
        // Empty-1:2188-Rectangle 813
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = 100.dp)
                .background(Color(0xfff5f5f5))
                .size(360.dp, 1918.dp),
        )
        // Column-1:2189-Frame 43
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 16.dp, y = 132.dp),
        ) {
            // Column-1:2190-Frame 3
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Text-1:2191-Good morning
                Text(
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                    text = "Good morning",
                    color = Color(0xff999ca0),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Left,
                    overflow = TextOverflow.Ellipsis,
                )
                // Row-1:2192-Frame 9
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Text-1:2193-Ajay Manva
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                        text = "Ajay Manva",
                        color = Color(0xff000000),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Image-1:2194-Frame 7644
                    Image(
                        painter = painterResource(id = R.drawable.image296),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(28.dp, 28.dp),
                    )
                }
            }
            // Column-1:2195-Frame 42
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 20.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Box-1:2196-Frame 6
                Box(
                    contentAlignment = Alignment.TopStart,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                        .size(328.dp, 200.dp),
                ) {
                    // Text-1:2197-Overview
                    Text(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .wrapContentSize()
                            .offset(x = 12.dp, y = 16.dp),
                        text = "Overview",
                        color = Color(0xff999ca0),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Box-1:2198-Chart
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .offset(x = 1.dp, y = 52.dp)
                            .background(Color(0xffffffff), RoundedCornerShape(4.dp))
                            .size(327.dp, 136.dp),
                    ) {
                        // Box-1:2199-Group 7536
                        Box(
                            contentAlignment = Alignment.TopStart,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 35.783.dp, y = 3.571.dp)
                                .size(34.153.dp, 130.952.dp),
                        ) {
                            // Image-1:2200-Grid_v_2
                            Image(
                                painter = painterResource(id = R.drawable.gridv2),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 17.377.dp, y = 0.dp)
                                    .size(1.dp, 108.929.dp)
                                    .border(1.dp, Color(0xfff2f2f2)),
                            )
                            // Text-1:2201-Jan
                            Text(
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 0.dp, y = 114.286.dp)
                                    .size(34.153.dp, 16.667.dp),
                                text = "Jan",
                                color = Color(0xff999ca0),
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Box-1:2202-Group 7535
                        Box(
                            contentAlignment = Alignment.TopStart,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 69.936.dp, y = 3.571.dp)
                                .size(34.153.dp, 130.952.dp),
                        ) {
                            // Image-1:2203-Grid_v_3
                            Image(
                                painter = painterResource(id = R.drawable.gridv3),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 17.265.dp, y = 0.dp)
                                    .size(1.dp, 108.929.dp)
                                    .border(1.dp, Color(0xfff2f2f2)),
                            )
                            // Text-1:2204-Feb
                            Text(
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 0.dp, y = 114.286.dp)
                                    .size(34.153.dp, 16.667.dp),
                                text = "Feb",
                                color = Color(0xff999ca0),
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Box-1:2205-Group 7534
                        Box(
                            contentAlignment = Alignment.TopStart,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 104.089.dp, y = 3.571.dp)
                                .size(34.153.dp, 130.952.dp),
                        ) {
                            // Image-1:2206-Grid_v_4
                            Image(
                                painter = painterResource(id = R.drawable.gridv4),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 17.03.dp, y = 0.dp)
                                    .size(1.dp, 108.929.dp)
                                    .border(1.dp, Color(0xfff2f2f2)),
                            )
                            // Text-1:2207-Mar
                            Text(
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 0.dp, y = 114.286.dp)
                                    .size(34.153.dp, 16.667.dp),
                                text = "Mar",
                                color = Color(0xff999ca0),
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Box-1:2208-Group 7533
                        Box(
                            contentAlignment = Alignment.TopStart,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 138.242.dp, y = 3.571.dp)
                                .size(34.153.dp, 130.952.dp),
                        ) {
                            // Image-1:2209-Grid_v_5
                            Image(
                                painter = painterResource(id = R.drawable.gridv5),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 17.282.dp, y = 0.dp)
                                    .size(1.dp, 108.929.dp)
                                    .border(1.dp, Color(0xfff2f2f2)),
                            )
                            // Text-1:2210-Apr
                            Text(
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 0.dp, y = 114.286.dp)
                                    .size(34.153.dp, 16.667.dp),
                                text = "Apr",
                                color = Color(0xff999ca0),
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Box-1:2211-Group 7532
                        Box(
                            contentAlignment = Alignment.TopStart,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 172.394.dp, y = 3.571.dp)
                                .size(34.153.dp, 130.952.dp),
                        ) {
                            // Image-1:2212-Grid_v_6
                            Image(
                                painter = painterResource(id = R.drawable.gridv6),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 16.981.dp, y = 0.dp)
                                    .size(1.dp, 108.929.dp)
                                    .border(1.dp, Color(0xfff2f2f2)),
                            )
                            // Text-1:2213-May
                            Text(
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 0.dp, y = 114.286.dp)
                                    .size(34.153.dp, 16.667.dp),
                                text = "May",
                                color = Color(0xff999ca0),
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Box-1:2214-Group 7538
                        Box(
                            contentAlignment = Alignment.TopStart,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 241.109.dp, y = 3.571.dp)
                                .size(34.153.dp, 130.952.dp),
                        ) {
                            // Image-1:2215-Grid_v_6
                            Image(
                                painter = painterResource(id = R.drawable.gridv6),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 16.981.dp, y = 0.dp)
                                    .size(1.dp, 108.929.dp)
                                    .border(1.dp, Color(0xfff2f2f2)),
                            )
                            // Text-1:2216-Jul
                            Text(
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 0.dp, y = 114.286.dp)
                                    .size(34.153.dp, 16.667.dp),
                                text = "Jul",
                                color = Color(0xff999ca0),
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Box-1:2217-Group 7531
                        Box(
                            contentAlignment = Alignment.TopStart,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 206.548.dp, y = 3.571.dp)
                                .size(34.153.dp, 130.952.dp),
                        ) {
                            // Image-1:2218-Grid_v_6
                            Image(
                                painter = painterResource(id = R.drawable.gridv6),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 17.172.dp, y = 0.dp)
                                    .size(1.dp, 108.929.dp)
                                    .border(1.dp, Color(0xfff2f2f2)),
                            )
                            // Text-1:2219-Jun
                            Text(
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 0.dp, y = 114.286.dp)
                                    .size(34.153.dp, 16.667.dp),
                                text = "Jun",
                                color = Color(0xff999ca0),
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Box-1:2220-Group 7539
                        Box(
                            contentAlignment = Alignment.TopStart,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 275.262.dp, y = 3.571.dp)
                                .size(34.153.dp, 130.952.dp),
                        ) {
                            // Image-1:2221-Grid_v_6
                            Image(
                                painter = painterResource(id = R.drawable.gridv6),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 17.172.dp, y = 0.dp)
                                    .size(1.dp, 108.929.dp)
                                    .border(1.dp, Color(0xfff2f2f2)),
                            )
                            // Text-1:2222-Aug
                            Text(
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .offset(x = 0.dp, y = 114.286.dp)
                                    .size(34.153.dp, 16.667.dp),
                                text = "Aug",
                                color = Color(0xff999ca0),
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Empty-1:2223-Grid_v_1
                        Box(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 35.827.dp, y = 112.5.dp)
                                .size(273.588.dp, 1.dp)
                                .border(1.dp, Color(0xfff2f2f2)),
                        )
                        // Text-1:2224-25
                        Text(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 8.957.dp, y = 77.53.dp)
                                .size(22.17.dp, 16.667.dp),
                            text = "25",
                            color = Color(0xff999ca0),
                            fontSize = 9.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Text-1:2225-0
                        Text(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 8.957.dp, y = 104.762.dp)
                                .size(22.17.dp, 16.667.dp),
                            text = "0",
                            color = Color(0xff999ca0),
                            fontSize = 9.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Empty-1:2226-Grid_v_2
                        Box(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 35.827.dp, y = 85.268.dp)
                                .size(273.588.dp, 1.dp)
                                .border(1.dp, Color(0xfff2f2f2)),
                        )
                        // Text-1:2227-50
                        Text(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 8.957.dp, y = 50.298.dp)
                                .size(22.17.dp, 16.667.dp),
                            text = "50",
                            color = Color(0xff999ca0),
                            fontSize = 9.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Empty-1:2228-Grid_v_3
                        Box(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 35.827.dp, y = 58.036.dp)
                                .size(273.588.dp, 1.dp)
                                .border(1.dp, Color(0xfff2f2f2)),
                        )
                        // Text-1:2229-75
                        Text(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 8.957.dp, y = 23.065.dp)
                                .size(22.17.dp, 16.667.dp),
                            text = "75",
                            color = Color(0xff999ca0),
                            fontSize = 9.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Empty-1:2230-Grid_v_4
                        Box(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 35.827.dp, y = 30.804.dp)
                                .size(273.588.dp, 1.dp)
                                .border(1.dp, Color(0xfff2f2f2)),
                        )
                        // Text-1:2231-100
                        Text(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 0.dp, y = -4.167.dp)
                                .size(30.313.dp, 16.667.dp),
                            text = "100",
                            color = Color(0xff999ca0),
                            fontSize = 9.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Empty-1:2232-Grid_v_5
                        Box(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 35.827.dp, y = 3.571.dp)
                                .size(273.588.dp, 1.dp)
                                .border(1.dp, Color(0xfff2f2f2)),
                        )
                        // Image-1:2233-Lines1
                        Image(
                            painter = painterResource(id = R.drawable.lines1),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 36.232.dp, y = 3.571.dp)
                                .size(273.522.dp, 91.518.dp),
                        )
                    }
                    // Image-1:2236-Lines2
                    Image(
                        painter = painterResource(id = R.drawable.lines2),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .offset(x = 37.078.dp, y = 56.195.dp)
                            .size(272.982.dp, 108.56.dp),
                    )
                    // Row-1:2239-Button
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .wrapContentSize()
                            .offset(x = 193.dp, y = 12.dp)
                            .border(1.dp, Color(0xffebebeb), RoundedCornerShape(6.dp))
                            .clip(RoundedCornerShape(6.dp))
                            .padding(start = 8.dp, top = 6.dp, end = 4.dp, bottom = 6.dp),
                    ) {
                        // Text-1:2240-Value
                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .size(92.dp, 11.dp),
                            text = "22 Aug - 23 Sept",
                            color = Color(0xff000000),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Image-1:2241-Time
                        Image(
                            painter = painterResource(id = R.drawable.time),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .size(16.dp, 16.dp),
                        )
                    }
                }
                // Row-1:2242-Frame 15
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentHeight()
                        .width(320.dp),
                ) {
                    // Box-1:2243-Frame 10
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                            .size(120.dp, 120.dp),
                    ) {
                        // Column-1:2244-Frame 14
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentSize()
                                .offset(x = 12.dp, y = 12.dp),
                        ) {
                            // Image-1:2245-Avatar
                            Image(
                                painter = painterResource(id = R.drawable.avatar),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .size(32.dp, 32.dp)
                                    .clip(RoundedCornerShape(100.dp)),
                            )
                            // Column-1:2251-Frame 10
                            Column(
                                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Row-1:2252-Frame 13
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .wrapContentSize(),
                                ) {
                                    // Text-1:2253-123
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                        text = "123",
                                        color = Color(0xff000000),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Text-1:2254-Today’s clicks
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .wrapContentSize(),
                                    text = "Today’s clicks",
                                    color = Color(0xff999ca0),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                    }
                    // Box-1:2255-Frame 11
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                            .size(120.dp, 120.dp),
                    ) {
                        // Column-1:2256-Frame 14
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentSize()
                                .offset(x = 12.dp, y = 12.dp),
                        ) {
                            // Image-1:2257-Avatar
                            Image(
                                painter = painterResource(id = R.drawable.pin),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .size(32.dp, 32.dp)
                                    .clip(RoundedCornerShape(100.dp)),
                            )
                            // Column-1:2260-Frame 10
                            Column(
                                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Row-1:2261-Frame 13
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .wrapContentSize(),
                                ) {
                                    // Text-1:2262-Ahamedab..
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                        text = "Ahamedab..",
                                        color = Color(0xff000000),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Text-1:2263-Top Location
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .wrapContentSize(),
                                    text = "Top Location",
                                    color = Color(0xff999ca0),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                    }
                    // Box-1:2264-Frame 11
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                            .size(120.dp, 120.dp),
                    ) {
                        // Column-1:2265-Frame 14
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentSize()
                                .offset(x = 12.dp, y = 12.dp),
                        ) {
                            // Image-1:2266-Avatar
                            Image(
                                painter = painterResource(id = R.drawable.generic),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .size(32.dp, 32.dp)
                                    .clip(RoundedCornerShape(100.dp)),
                            )
                            // Column-1:2269-Frame 10
                            Column(
                                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Row-1:2270-Frame 13
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .wrapContentSize(),
                                ) {
                                    // Text-1:2271-Instagram
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                        text = "Instagram",
                                        color = Color(0xff000000),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Text-1:2272-Top source
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .wrapContentSize(),
                                    text = "Top source",
                                    color = Color(0xff999ca0),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                    }
                    // Box-1:2273-Frame 9
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                            .size(120.dp, 120.dp),
                    ) {
                        // Column-1:2274-Frame 14
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentSize()
                                .offset(x = 12.dp, y = 12.dp),
                        ) {
                            // Image-1:2275-Avatar
                            Image(
                                painter = painterResource(id = R.drawable.software),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .size(32.dp, 32.dp)
                                    .clip(RoundedCornerShape(100.dp)),
                            )
                            // Column-1:2278-Frame 10
                            Column(
                                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Row-1:2279-Frame 13
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .wrapContentSize(),
                                ) {
                                    // Text-1:2280-11:00 - 12:00
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                        text = "11:00 - 12:00",
                                        color = Color(0xff000000),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Text-1:2281-Best Time
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .wrapContentSize(),
                                    text = "Best Time",
                                    color = Color(0xff999ca0),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                    }
                }
                // Row-1:2282-Button
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.End)
                        .wrapContentHeight()
                        .width(328.dp)
                        .border(1.dp, Color(0xffd8d8d8), RoundedCornerShape(8.dp))
                        .clip(RoundedCornerShape(8.dp))
                        .padding(horizontal = 12.dp, vertical = 8.dp),
                ) {
                    // Image-1:2283-Arrows
                    Image(
                        painter = painterResource(id = R.drawable.arrows),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(32.dp, 32.dp),
                    )
                    // Text-1:2284-Value
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                        text = "View Analytics",
                        color = Color(0xff000000),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }
        // Column-1:2285-Frame 59443
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 28.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 16.dp, y = 664.dp),
        ) {
            // Column-1:2286-Frame 7727
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.CenterVertically),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.Start)
                    .size(328.dp, 36.dp),
            ) {
                // Row-1:2287-Frame 59594
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentHeight()
                        .width(328.dp),
                ) {
                    // Row-1:2288-Frame 7843
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize(),
                    ) {
                        // Row-1:2289-Frame 7842
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.Top,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentSize()
                                .background(Color(0xff0e6fff), RoundedCornerShape(18.dp))
                                .padding(horizontal = 16.dp, vertical = 6.dp),
                        ) {
                            // Text-1:2290-Top Links
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Top)
                                    .wrapContentSize(),
                                text = "Top Links",
                                color = Color(0xffffffff),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Text-1:2291-Recent Links
                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentSize(),
                            text = "Recent Links",
                            color = Color(0xffebebeb),
                            fontSize = 16.sp,
                           // fontWeight = 600.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Image-1:2292-Input Container
                    Image(
                        painter = painterResource(id = R.drawable.generic2),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .wrapContentHeight()
                            .offset(x = 292.dp, y = 0.dp)
                            .width(36.dp)
                            .border(1.dp, Color(0xffebebeb), RoundedCornerShape(8.dp))
                            .padding(all = 6.dp),
                    )
                }
            }
            // Column-1:2294-Frame 59595
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 20.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Column-1:2295-Frame 53
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .size(328.dp, 116.dp),
                ) {
                    // Box-1:2296-Frame 35
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                            .size(328.dp, 116.dp)
                            .clip(RoundedCornerShape(8.dp)),
                    ) {
                        // Column-1:2297-Frame 22
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentHeight()
                                .offset(x = 12.dp, y = 12.dp)
                                .width(304.dp),
                        ) {
                            // Row-1:2298-Frame 20
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 50.dp, alignment = Alignment.CenterHorizontally),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(304.dp),
                            ) {
                                // Row-1:2299-Frame 19
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Image-1:2300-Default link
                                    Image(
                                        painter = painterResource(id = R.drawable.rectangle808),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .size(48.dp, 48.dp),
                                    )
                                    // Column-1:2302-Frame 16
                                    Column(
                                        verticalArrangement = Arrangement.spacedBy(space = 2.dp, alignment = Alignment.Top),
                                        horizontalAlignment = Alignment.Start,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-1:2303-Sample link name...
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .wrapContentSize(),
                                            text = "Sample link name...",
                                            color = Color(0xff000000),
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Left,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                        // Row-1:2304-Frame 18
                                        Row(
                                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .wrapContentSize(),
                                        ) {
                                            // Text-1:2305-22 Aug 2022
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .wrapContentSize(),
                                                text = "22 Aug 2022",
                                                color = Color(0xff999ca0),
                                                fontSize = 12.sp,
                                                fontWeight = FontWeight.Normal,
                                                textAlign = TextAlign.Left,
                                                overflow = TextOverflow.Ellipsis,
                                            )
                                        }
                                    }
                                }
                                // Column-1:2306-Frame 17
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 2.dp, alignment = Alignment.CenterVertically),
                                    horizontalAlignment = Alignment.End,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Row-1:2307-Frame 21
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Start),
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .align(Alignment.End)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-1:2308-2323
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .wrapContentSize(),
                                            text = "2323",
                                            color = Color(0xff000000),
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Right,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                    // Text-1:2309-Clicks
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.End)
                                            .wrapContentSize()
                                            .offset(x = 1.dp, y = 0.dp),
                                        text = "Clicks",
                                        color = Color(0xff999ca0),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                        }
                        // Box-1:2310-Group 7616
                        Box(
                            contentAlignment = Alignment.TopStart,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 0.dp, y = 76.dp)
                                .size(328.dp, 40.dp),
                        ) {
                            // Box-1:2311-Group 7542
                            Box(
                                contentAlignment = Alignment.TopStart,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .size(328.dp, 40.dp),
                            ) {
                                // Empty-1:2312-Rectangle 809
                                Box(
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .background(Color(0xffe7f0ff))
                                        .size(328.dp, 40.dp)
                                        .border(1.dp, Color(0xffa5c7ff)),
                                )
                                // Row-1:2313-Frame 30
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterHorizontally),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .offset(x = 12.dp, y = 8.dp)
                                        .size(304.dp, 24.dp),
                                ) {
                                    // Row-1:2314-Frame 31
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-1:2315-https://samplelink.oia.bio/ashd...
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .size(214.dp, 11.dp),
                                            text = "https://samplelink.oia.bio/ashd...",
                                            color = Color(0xff0e6fff),
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Left,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                    // Image-1:2316-Files
                                    Image(
                                        painter = painterResource(id = R.drawable.files),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .size(24.dp, 24.dp),
                                    )
                                }
                            }
                        }
                    }
                }
                // Column-1:2317-Frame 54
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .size(328.dp, 116.dp),
                ) {
                    // Box-1:2318-Frame 35
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                            .size(328.dp, 116.dp)
                            .clip(RoundedCornerShape(8.dp)),
                    ) {
                        // Column-1:2319-Frame 22
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentHeight()
                                .offset(x = 12.dp, y = 12.dp)
                                .width(304.dp),
                        ) {
                            // Row-1:2320-Frame 20
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 50.dp, alignment = Alignment.CenterHorizontally),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(304.dp),
                            ) {
                                // Row-1:2321-Frame 19
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Image-1:2322-Default link
                                    Image(
                                        painter = painterResource(id = R.drawable.rectangle808),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .size(48.dp, 48.dp),
                                    )
                                    // Column-1:2324-Frame 16
                                    Column(
                                        verticalArrangement = Arrangement.spacedBy(space = 2.dp, alignment = Alignment.Top),
                                        horizontalAlignment = Alignment.Start,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-1:2325-Sample link name...
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .wrapContentSize(),
                                            text = "Sample link name...",
                                            color = Color(0xff000000),
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Left,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                        // Row-1:2326-Frame 18
                                        Row(
                                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .wrapContentSize(),
                                        ) {
                                            // Text-1:2327-22 Aug 2022
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .wrapContentSize(),
                                                text = "22 Aug 2022",
                                                color = Color(0xff999ca0),
                                                fontSize = 12.sp,
                                                fontWeight = FontWeight.Normal,
                                                textAlign = TextAlign.Left,
                                                overflow = TextOverflow.Ellipsis,
                                            )
                                        }
                                    }
                                }
                                // Column-1:2328-Frame 17
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 2.dp, alignment = Alignment.CenterVertically),
                                    horizontalAlignment = Alignment.End,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Row-1:2329-Frame 21
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Start),
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .align(Alignment.End)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-1:2330-2323
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .wrapContentSize(),
                                            text = "2323",
                                            color = Color(0xff000000),
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Right,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                    // Text-1:2331-Clicks
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.End)
                                            .wrapContentSize()
                                            .offset(x = 1.dp, y = 0.dp),
                                        text = "Clicks",
                                        color = Color(0xff999ca0),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                        }
                        // Box-1:2332-Group 7616
                        Box(
                            contentAlignment = Alignment.TopStart,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 0.dp, y = 76.dp)
                                .size(328.dp, 40.dp),
                        ) {
                            // Box-1:2333-Group 7542
                            Box(
                                contentAlignment = Alignment.TopStart,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .size(328.dp, 40.dp),
                            ) {
                                // Empty-1:2334-Rectangle 809
                                Box(
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .background(Color(0xffe7f0ff))
                                        .size(328.dp, 40.dp)
                                        .border(1.dp, Color(0xffa5c7ff)),
                                )
                                // Row-1:2335-Frame 30
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterHorizontally),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .offset(x = 12.dp, y = 8.dp)
                                        .size(304.dp, 24.dp),
                                ) {
                                    // Row-1:2336-Frame 31
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-1:2337-https://samplelink.oia.bio/ashd...
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .size(214.dp, 11.dp),
                                            text = "https://samplelink.oia.bio/ashd...",
                                            color = Color(0xff0e6fff),
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Left,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                    // Image-1:2338-Files
                                    Image(
                                        painter = painterResource(id = R.drawable.files),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .size(24.dp, 24.dp),
                                    )
                                }
                            }
                        }
                    }
                }
                // Column-1:2339-Frame 55
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .size(328.dp, 116.dp),
                ) {
                    // Box-1:2340-Frame 35
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                            .size(328.dp, 116.dp)
                            .clip(RoundedCornerShape(8.dp)),
                    ) {
                        // Column-1:2341-Frame 22
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentHeight()
                                .offset(x = 12.dp, y = 12.dp)
                                .width(304.dp),
                        ) {
                            // Row-1:2342-Frame 20
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 50.dp, alignment = Alignment.CenterHorizontally),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(304.dp),
                            ) {
                                // Row-1:2343-Frame 19
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Image-1:2344-Default link
                                    Image(
                                        painter = painterResource(id = R.drawable.rectangle808),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .size(48.dp, 48.dp),
                                    )
                                    // Column-1:2346-Frame 16
                                    Column(
                                        verticalArrangement = Arrangement.spacedBy(space = 2.dp, alignment = Alignment.Top),
                                        horizontalAlignment = Alignment.Start,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-1:2347-Sample link name...
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .wrapContentSize(),
                                            text = "Sample link name...",
                                            color = Color(0xff000000),
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Left,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                        // Row-1:2348-Frame 18
                                        Row(
                                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .wrapContentSize(),
                                        ) {
                                            // Text-1:2349-22 Aug 2022
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .wrapContentSize(),
                                                text = "22 Aug 2022",
                                                color = Color(0xff999ca0),
                                                fontSize = 12.sp,
                                                fontWeight = FontWeight.Normal,
                                                textAlign = TextAlign.Left,
                                                overflow = TextOverflow.Ellipsis,
                                            )
                                        }
                                    }
                                }
                                // Column-1:2350-Frame 17
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 2.dp, alignment = Alignment.CenterVertically),
                                    horizontalAlignment = Alignment.End,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Row-1:2351-Frame 21
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Start),
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .align(Alignment.End)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-1:2352-2323
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .wrapContentSize(),
                                            text = "2323",
                                            color = Color(0xff000000),
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Right,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                    // Text-1:2353-Clicks
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.End)
                                            .wrapContentSize()
                                            .offset(x = 1.dp, y = 0.dp),
                                        text = "Clicks",
                                        color = Color(0xff999ca0),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                        }
                        // Box-1:2354-Group 7616
                        Box(
                            contentAlignment = Alignment.TopStart,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 0.dp, y = 76.dp)
                                .size(328.dp, 40.dp),
                        ) {
                            // Box-1:2355-Group 7542
                            Box(
                                contentAlignment = Alignment.TopStart,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .size(328.dp, 40.dp),
                            ) {
                                // Empty-1:2356-Rectangle 809
                                Box(
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .background(Color(0xffe7f0ff))
                                        .size(328.dp, 40.dp)
                                        .border(1.dp, Color(0xffa5c7ff)),
                                )
                                // Row-1:2357-Frame 30
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterHorizontally),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .offset(x = 12.dp, y = 8.dp)
                                        .size(304.dp, 24.dp),
                                ) {
                                    // Row-1:2358-Frame 31
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-1:2359-https://samplelink.oia.bio/ashd...
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .size(214.dp, 11.dp),
                                            text = "https://samplelink.oia.bio/ashd...",
                                            color = Color(0xff0e6fff),
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Left,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                    // Image-1:2360-Files
                                    Image(
                                        painter = painterResource(id = R.drawable.files),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .size(24.dp, 24.dp),
                                    )
                                }
                            }
                        }
                    }
                }
                // Column-1:2361-Frame 56
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .size(328.dp, 116.dp),
                ) {
                    // Box-1:2362-Frame 35
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                            .size(328.dp, 116.dp)
                            .clip(RoundedCornerShape(8.dp)),
                    ) {
                        // Column-1:2363-Frame 22
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentHeight()
                                .offset(x = 12.dp, y = 12.dp)
                                .width(304.dp),
                        ) {
                            // Row-1:2364-Frame 20
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 50.dp, alignment = Alignment.CenterHorizontally),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(304.dp),
                            ) {
                                // Row-1:2365-Frame 19
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Image-1:2366-Default link
                                    Image(
                                        painter = painterResource(id = R.drawable.rectangle808),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .size(48.dp, 48.dp),
                                    )
                                    // Column-1:2368-Frame 16
                                    Column(
                                        verticalArrangement = Arrangement.spacedBy(space = 2.dp, alignment = Alignment.Top),
                                        horizontalAlignment = Alignment.Start,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-1:2369-Sample link name...
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .wrapContentSize(),
                                            text = "Sample link name...",
                                            color = Color(0xff000000),
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Left,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                        // Row-1:2370-Frame 18
                                        Row(
                                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .wrapContentSize(),
                                        ) {
                                            // Text-1:2371-22 Aug 2022
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .wrapContentSize(),
                                                text = "22 Aug 2022",
                                                color = Color(0xff999ca0),
                                                fontSize = 12.sp,
                                                fontWeight = FontWeight.Normal,
                                                textAlign = TextAlign.Left,
                                                overflow = TextOverflow.Ellipsis,
                                            )
                                        }
                                    }
                                }
                                // Column-1:2372-Frame 17
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 2.dp, alignment = Alignment.CenterVertically),
                                    horizontalAlignment = Alignment.End,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Row-1:2373-Frame 21
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Start),
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .align(Alignment.End)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-1:2374-2323
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .wrapContentSize(),
                                            text = "2323",
                                            color = Color(0xff000000),
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Right,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                    // Text-1:2375-Clicks
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.End)
                                            .wrapContentSize()
                                            .offset(x = 1.dp, y = 0.dp),
                                        text = "Clicks",
                                        color = Color(0xff999ca0),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                        }
                        // Box-1:2376-Group 7616
                        Box(
                            contentAlignment = Alignment.TopStart,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 0.dp, y = 76.dp)
                                .size(328.dp, 40.dp),
                        ) {
                            // Box-1:2377-Group 7542
                            Box(
                                contentAlignment = Alignment.TopStart,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .size(328.dp, 40.dp),
                            ) {
                                // Empty-1:2378-Rectangle 809
                                Box(
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .background(Color(0xffe7f0ff))
                                        .size(328.dp, 40.dp)
                                        .border(1.dp, Color(0xffa5c7ff)),
                                )
                                // Row-1:2379-Frame 30
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterHorizontally),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .offset(x = 12.dp, y = 8.dp)
                                        .size(304.dp, 24.dp),
                                ) {
                                    // Row-1:2380-Frame 31
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-1:2381-https://samplelink.oia.bio/ashd...
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .size(214.dp, 11.dp),
                                            text = "https://samplelink.oia.bio/ashd...",
                                            color = Color(0xff0e6fff),
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Left,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                    // Image-1:2382-Files
                                    Image(
                                        painter = painterResource(id = R.drawable.files),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .size(24.dp, 24.dp),
                                    )
                                }
                            }
                        }
                    }
                }
                // Row-1:2383-Button
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.End)
                        .wrapContentHeight()
                        .width(328.dp)
                        .border(1.dp, Color(0xffd8d8d8), RoundedCornerShape(8.dp))
                        .clip(RoundedCornerShape(8.dp))
                        .padding(horizontal = 12.dp, vertical = 8.dp),
                ) {
                    // Image-1:2384-Mail
                    Image(
                        painter = painterResource(id = R.drawable.mail),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(32.dp, 32.dp),
                    )
                    // Text-1:2385-Value
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                        text = "View all Links",
                        color = Color(0xff000000),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }
        // Column-1:2418-Frame 59556
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 16.dp, y = 1360.dp),
        ) {
            // Box-1:2419-Frame 7671
            Box(
                contentAlignment = Alignment.TopStart,
                modifier = Modifier
                    .align(Alignment.Start)
                    .background(Color(0x1e4ad15f), RoundedCornerShape(8.dp))
                    .size(328.dp, 64.dp)
                    .border(1.dp, Color(0x514ad15f), RoundedCornerShape(8.dp)),
            ) {
                // Row-1:2420-Frame 51
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .wrapContentSize()
                        .offset(x = 12.dp, y = 20.dp),
                ) {
                    // Image-1:2421-Group 7566
                    Image(
                        painter = painterResource(id = R.drawable.group7),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(24.dp, 24.dp),
                    )
                    // Column-1:2426-Frame 50
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                    ) {
                        // Text-1:2427-Talk with us
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                            text = "Talk with us",
                            color = Color(0xff000000),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
            // Box-1:2428-Frame 7670
            Box(
                contentAlignment = Alignment.TopStart,
                modifier = Modifier
                    .align(Alignment.Start)
                    .background(Color(0xffe7f0ff), RoundedCornerShape(8.dp))
                    .size(328.dp, 65.dp)
                    .border(1.dp, Color(0x510e6fff), RoundedCornerShape(8.dp)),
            ) {
                // Row-1:2429-Frame 51
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .wrapContentSize()
                        .offset(x = 12.dp, y = 21.dp),
                ) {
                    // Image-1:2430-Group 7566
                    Image(
                        painter = painterResource(id = R.drawable.question),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(24.dp, 24.dp),
                    )
                    // Column-1:2432-Frame 50
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                    ) {
                        // Text-1:2433-Frequently Asked Questions
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                            text = "Frequently Asked Questions",
                            color = Color(0xff000000),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
        }
        // Column-1:2478-TabBar
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                //.advancedShadow(color = Color(0x0a000000), alpha = 0.03999999910593033f, cornersRadius = 0.dp, shadowBlurRadius = 6.dp, offsetX = 0.dp, offsetY = -1.dp)
                .background(Color(0xffffffff))
                .size(360.dp, 77.dp),
        ) {
            // Box-I1:2478;577:36102-Frame 59423
            Box(
                contentAlignment = Alignment.TopStart,
                modifier = Modifier
                    .align(Alignment.Start)
                    .fillMaxWidth()
                    .padding(start = 0.dp, end = 0.dp)
                    .height(73.dp),
            ) {
                // Box-I1:2478;1688:72115-TabBar-item
                Box(
                    contentAlignment = Alignment.TopStart,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .offset(x = 0.dp, y = 6.dp)
                        .size(72.dp, 61.dp),
                ) {
                    // Image-I1:2478;1688:72116-Mail
                    Image(
                        painter = painterResource(id = R.drawable.link),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .offset(x = 20.dp, y = 6.5.dp)
                            .size(32.dp, 32.dp),
                    )
                    // Text-I1:2478;1688:72117-Links
                    Text(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .wrapContentSize()
                            .offset(x = 22.5.dp, y = 42.5.dp),
                        text = "Links",
                        color = Color(0xff000000),
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Box-I1:2478;1688:72520-TabBar-item
                Box(
                    contentAlignment = Alignment.TopStart,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .offset(x = 216.dp, y = 6.dp)
                        .size(72.dp, 61.dp),
                ) {
                    // Image-I1:2478;1688:72521-Media
                    Image(
                        painter = painterResource(id = R.drawable.speaker),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .offset(x = 20.dp, y = 6.5.dp)
                            .size(32.dp, 32.dp),
                    )
                    // Text-I1:2478;1688:72522-Campaigns
                    Text(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .wrapContentSize()
                            .offset(x = 8.dp, y = 42.5.dp),
                        text = "Campaigns",
                        color = Color(0xff999ca0),
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Image-I1:2478;577:36113-TabBar-item
                Image(
                    painter = painterResource(id = R.drawable.union),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .offset(x = 144.dp, y = 0.dp)
                        .size(72.dp, 49.dp),
                )
                // Box-I1:2478;1688:72939-TabBar-item
                Box(
                    contentAlignment = Alignment.TopStart,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .offset(x = 72.dp, y = 6.dp)
                        .size(72.dp, 61.dp),
                ) {
                    // Image-I1:2478;1688:72940-Files
                    Image(
                        painter = painterResource(id = R.drawable.book),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .offset(x = 20.dp, y = 6.5.dp)
                            .size(32.dp, 32.dp),
                    )
                    // Text-I1:2478;1688:72941-Courses
                    Text(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .wrapContentSize()
                            .offset(x = 15.5.dp, y = 42.5.dp),
                        text = "Courses",
                        color = Color(0xff999ca0),
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Box-I1:2478;1688:73372-TabBar-item
                Box(
                    contentAlignment = Alignment.TopStart,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .offset(x = 288.dp, y = 6.dp)
                        .size(72.dp, 61.dp),
                ) {
                    // Image-I1:2478;1688:73373-Generic
                    Image(
                        painter = painterResource(id = R.drawable.you),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .offset(x = 20.dp, y = 6.5.dp)
                            .size(32.dp, 32.dp),
                    )
                    // Text-I1:2478;1688:73374-Profile
                    Text(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .wrapContentSize()
                            .offset(x = 20.dp, y = 42.5.dp),
                        text = "Profile",
                        color = Color(0xff999ca0),
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
            // Empty-I1:2478;577:36127-Home Indicator
            Box(
                modifier = Modifier
                    .align(Alignment.Start)
                    .fillMaxWidth()
                    .padding(start = 0.dp, end = 0.dp)
                    .height(15.dp),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CodiaMainViewPreview() {
    OpeninappTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                Openinapp()
            }
        }
    }
}
