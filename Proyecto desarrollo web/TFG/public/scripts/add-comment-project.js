'use strict';
let comentario = document.getElementById('addANote');
comentario.addEventListener('keypress', function (event) {
    if (event.key == 'Enter') {//Se quiere subir un comentario, luego se entra en acción
        $.ajaxSetup({
            headers: {
                'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
            }
        });
        let project_id = document.getElementById('proyecto').value;//Conseguir la id del proyecto
        let url_parcial = window.location.href;//Conseguir la URL actual
        url_parcial = url_parcial.replace("/projects.show/" + project_id, "");//Cambiarla por la URL raiz
        let url = url_parcial + "/api/pcomments.store";
        let user_id=document.getElementById('user').value;
        let comentario=document.getElementById('addANote').value;
        console.log(url, user_id, project_id, comentario);
        // $.ajax({
        //     data: {
        //         user_id: user_id,
        //         project_id: project_id,
        //         comentario: comentario
        //     },
        //     url: url,
        //     type: 'POST',
        //     dataType: 'json',
        //     success: function (data) {
        //         console.log('Éxito');
        //     },
        //     error: function (data) {
        //         console.log('Fracaso');
        //     }
        // });
    }
});
