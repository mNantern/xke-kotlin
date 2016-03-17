package fr.xebia.xke

import java.time.Instant
import java.util.*

data class Data(val smartphoneId: UUID, val type: String, val eventTime: Instant, val value: String)