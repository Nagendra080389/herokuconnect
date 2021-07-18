$(document).ready(function () {
    fetch('/fetchAllContacts')
        .then(data => {
        $('#example').DataTable({
            data: data,
            columns: [
                { data: 'sfid' },
                { data: 'firstname' },
                { data: 'lastname' },
                { data: 'name' }
            ]
        });
    }).catch(error => {
        debugger;
    });
});