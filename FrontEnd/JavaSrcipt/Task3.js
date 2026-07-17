
/**
 * Task 3: Student Object
Create a student object containing:
- Name
- Age
- Course
- City
- Marks
Perform the following operations:
- Print the complete object.
- Update the city.
- Add a new property called `email`.
- Delete the `course` property.
 */

var student=[name1="pradeep Taware",
    age=23,
    city="Baramati",
    marks=90,
    course="mca"
]


console.log(student)

student.city="Pune"

console.log(student)

student.email="pradeeptaware345@gmail.com"

delete student.course

console.log(student)