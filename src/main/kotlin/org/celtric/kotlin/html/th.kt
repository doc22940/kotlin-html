package org.celtric.kotlin.html

fun th(
    // Optional
    colspan: Int? = null,
    rowspan: Int? = null,

    // Global
    css: String? = null,
    id: String? = null,
    title: String? = null,

    // Custom
    other: Attributes = emptyMap(),
    data: Attributes = emptyMap(),

    // Content
    content: () -> Any
) = Element("th", true, content(), AllAttributes(mapOf(
    "colspan" to colspan?.toString(),
    "rowspan" to rowspan?.toString(),
    "class" to css,
    "id" to id,
    "title" to title
), other, data))

fun th(content: String) = th { content }
fun th(content: Node) = th { content }
fun th(content: List<Node>) = th { content }