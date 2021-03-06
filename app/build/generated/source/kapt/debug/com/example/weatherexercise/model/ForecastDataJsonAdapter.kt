// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.example.weatherexercise.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.lang.NullPointerException
import kotlin.Double
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

public class ForecastDataJsonAdapter(
  moshi: Moshi
) : JsonAdapter<ForecastData>() {
  private val options: JsonReader.Options = JsonReader.Options.of("city", "cnt", "cod", "list",
      "message")

  private val nullableCityAdapter: JsonAdapter<City?> = moshi.adapter(City::class.java, emptySet(),
      "city")

  private val nullableDoubleAdapter: JsonAdapter<Double?> =
      moshi.adapter(Double::class.javaObjectType, emptySet(), "cnt")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "cod")

  private val nullableListOfForecastDetailsAdapter: JsonAdapter<List<ForecastDetails>?> =
      moshi.adapter(Types.newParameterizedType(List::class.java, ForecastDetails::class.java),
      emptySet(), "list")

  public override fun toString(): String = buildString(34) {
      append("GeneratedJsonAdapter(").append("ForecastData").append(')') }

  public override fun fromJson(reader: JsonReader): ForecastData {
    var city: City? = null
    var cnt: Double? = null
    var cod: String? = null
    var list: List<ForecastDetails>? = null
    var message: Double? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> city = nullableCityAdapter.fromJson(reader)
        1 -> cnt = nullableDoubleAdapter.fromJson(reader)
        2 -> cod = nullableStringAdapter.fromJson(reader)
        3 -> list = nullableListOfForecastDetailsAdapter.fromJson(reader)
        4 -> message = nullableDoubleAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return ForecastData(
        city = city,
        cnt = cnt,
        cod = cod,
        list = list,
        message = message
    )
  }

  public override fun toJson(writer: JsonWriter, value_: ForecastData?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("city")
    nullableCityAdapter.toJson(writer, value_.city)
    writer.name("cnt")
    nullableDoubleAdapter.toJson(writer, value_.cnt)
    writer.name("cod")
    nullableStringAdapter.toJson(writer, value_.cod)
    writer.name("list")
    nullableListOfForecastDetailsAdapter.toJson(writer, value_.list)
    writer.name("message")
    nullableDoubleAdapter.toJson(writer, value_.message)
    writer.endObject()
  }
}
