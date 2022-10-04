def map = [
    'FF0000' : 'Red',
    '00FF00' : 'Lime',
    '0000FF' : 'Blue',
    'FFFF00' : 'Yellow'
]

map.eachWithIndex { entry, index ->
    //def indent = ((index == 0 || index % 2 == 0) ? "   " : "")
    println "$index Hex Code: $entry.key = Color Name: $entry.value"
}