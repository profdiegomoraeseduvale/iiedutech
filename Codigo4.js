function buscarDados() {
    fetch("https://jsonplaceholder.typicode.com/posts/1")
        .then(res => res.json())
        .then(data => {
            return data;
        });
}

const resultado = buscarDados();
console.log(resultado.title);

/*
A função acima está retornando o valor Undefined. Encontre o erro e corrija-o. 
*/