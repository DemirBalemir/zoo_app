$('#button1').click(function() {
    fetch('/api/habitats')
    .then(response => response.json())
    .then(data => {
        console.log(data); // Log the data to the console
        let html = '<table><tr><th>ID</th><th>Capacity</th><th>Type</th></tr>';
        for (let Habitat of data) {
            html += `<tr><td>${Habitat.HabitatID}</td><td>${Habitat.Capacity}</td><td>${Habitat.Habitat_Type}</td></tr>`;
        }
        html += '</table>';
        $('#habitat-container').html(html);
    })
    .catch(error => console.error('Error:', error));
});