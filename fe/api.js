const baseUrl = "http://localhost:3000/api/v1"

const instanceApi =  axios.create({
    baseURL: baseUrl,
    timeout: 5000,
});



function getEmployees(){
    const name = document.querySelector("#search").value || ""
    instanceApi.get('/employees', {
        name
    }).then((res) => {
        console.log(res);
        tbody.innerHTML = ''
        const classes = res.data;
        const classItem = (classObj) => `<tr>
        <td>${classObj.id}</td>
        <td>${classObj.name}</td>
        <td>${classObj.wage}</td>
      </tr>`

      const trs = classes.map(item => classItem(item)).join(' ')
        tbody.innerHTML = trs
    }).catch((err) => {
        console.log(err);
    });
}


function create(){
    const name = document.querySelector("#name").value
    const wage = document.querySelector("#wage").value
    if(!name || !wage){
        alert("Điền đủ các trường")
        return
    }
    instanceApi.post('/create', {
        name,
        wage
    }).then((res) => {
        tbody.innerHTML = ''
        getEmployees()
    }).catch((err) => {
        console.log(err);
    });

}


