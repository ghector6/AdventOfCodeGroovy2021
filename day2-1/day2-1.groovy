def inputday2 = new File("/Users/ghector6/MakingDevsProjects/AdventOfCode/day2-1/inputday2.txt").text

inputday2.eachLine{ num ->
	int lastDig = Integer.parseInt(num.getAt(-1))
	println lastDig
}