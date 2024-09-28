console.log("This is a popup!")

function handleClientLoad() {
    gapi.load('client:auth2', initClient);
}

function initClient() {
    gapi.client.init({
        apiKey: 'YOUR_API_KEY',
        clientId: '499252790815-1i2afaa9un13oj0l65t2rln3kaej9b85.apps.googleusercontent.com',//'YOUR_CLIENT_ID',
        discoveryDocs: ["https://www.googleapis.com/discovery/v1/apis/calendar/v3/rest"],
        scope: "https://www.googleapis.com/auth/calendar.readonly"
    }).then(() => {
        // Handle sign-in
        gapi.auth2.getAuthInstance().signIn().then(fetchEvents);
    });
}


function authenticate() {
    return new Promise((resolve, reject) => {
        chrome.identity.getAuthToken({ interactive: true }, (token) => {
            if (chrome.runtime.lastError || !token) {
                reject(chrome.runtime.lastError);
            } else {
                resolve(token);
            }
        });
    });
}

async function fetchCalendarEvents() {
    const token = await authenticate();
    const response = await fetch('https://www.googleapis.com/calendar/v3/calendars/primary/events', {
        headers: {
            Authorization: `Bearer ${token}`
        }
    });
    const events = await response.json();
    console.log(events);
}


function fetchEvents() {
    gapi.client.calendar.events.list({
        'calendarId': 'primary',
        'timeMin': (new Date()).toISOString(),
        'maxResults': 10,
        'singleEvents': true,
        'orderBy': 'startTime'
    }).then(response => {
        const events = response.result.items;
        if (events.length) {
            events.forEach(event => {
                console.log(event.summary);
            });
        } else {
            console.log('No upcoming events found.');
        }
    });
}

document.addEventListener('DOMContentLoaded', handleClientLoad);