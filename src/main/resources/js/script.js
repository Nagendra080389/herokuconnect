$(document).ready(function () {
    fetch('/fetchAllContacts')
        .then(response => {
            response.json()
        }).then(data => {
        $('#example').DataTable({
            data: data,
            columns: [
                { data: 'sfid' },
                { data: 'firstname' },
                { data: 'lastname' },
                { data: 'name' }
            ]
        });
    });
});