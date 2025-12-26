function showCourses(){
    fetch("http://localhost:8080/courses")
    .then(response => response.json())
    .then((courses) => {
        const datatable = document.getElementById("coursetable");
        courses.forEach(course => {
            var row = `<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.durationInWeeks}</td>
            <td>${course.trainer}</td>
            </tr>`;
            datatable.innerHTML+=row;
        });
    })
}


function  showEnrolledStudents(){
    fetch("http://localhost:8080/courses/enrolled")
    .then(response => response.json())
    .then((courseRegistrations) => {
        const datatable = document.getElementById("studenttable");
        courseRegistrations.forEach(courseRegistration => {
             var row = `<tr>
            <td>${courseRegistration.rollNo}</td>
            <td>${courseRegistration.name}</td>
            <td>${courseRegistration.emailId}</td>
            <td>${courseRegistration.courseName}</td>
            </tr>`;
            datatable.innerHTML+=row;
        });
    })
}