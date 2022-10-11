def s = """
00100
11110
10110
"""

println s.trim()
println "-"*100
println s.trim().split("\n")
println "#"*100
println s.trim().split("\n")[2]
println "%"*100
println s.trim().split("\n")[2].split("")
println "&"*100
println s.trim().split("\n")[2].split("").size()