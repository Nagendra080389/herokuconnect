$(document).ready(function () {
    async function fetchAllContactsFromServer() {
        let url = '/fetchAllContacts';
        try {
            let res = await fetch(url);
            return await res.json();
        } catch (error) {
            console.log(error);
        }
    }

    let promiseFunction = fetchAllContactsFromServer();
    promiseFunction.then(responseData => {
        $('#example').DataTable({
            data: responseData,
            columns: [
                {data: 'sfid'},
                {data: 'firstname'},
                {data: 'lastname'},
                {data: 'name'}
            ]
        });
    })

});