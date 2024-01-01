$(document).ready(function() {
    $('#button1').click(function() {
        fetch("/api/habitats")
        .then(response => response.json())
        .then(data => {
            console.log(data);
            let html = '<table><tr><th>Habitat ID</th><th>Capacity</th><th>Habitat Type</th></tr>';
            for (let habitat of data) {
                html += `<tr><td>${habitat.HabitatID}</td><td>${habitat.Capacity}</td><td>${habitat.Habitat_Type}</td></tr>`;
            }
            html += '</table>';

            // Insert the HTML into the page
            $('#habitat-container').html(html);
        })
        .catch(error => console.error('Error:', error));
    });
});