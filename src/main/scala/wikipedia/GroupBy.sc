val ages = List(2,52, 44, 23, 17, 14, 12, 82, 51, 64)
val grouped = ages.groupBy { age =>
    if(age >=18 && age < 65) "adult"
    else if(age <18) "child"
    else "senior"
}
println(grouped)
//Map(senior -> List(82), adult -> List(52, 44, 23, 51, 64), child -> List(2, 17, 14, 12))
