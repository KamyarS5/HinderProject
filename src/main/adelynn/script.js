const app = document.getElementById("app");

function showNav() {
    document.body.classList.add("show-nav");
}

function hideNav() {
    document.body.classList.remove("show-nav");
}

function loadHome() {
    hideNav(); // Hide navigation buttons on home page
    app.innerHTML = `
        <div class="container">
            <h1>Welcome to Hinder</h1>
            <p>Matching tenants with landlords seamlessly.</p>
            <button onclick="loadSignUp()">Sign Up</button>
            <button onclick="loadLogin()">Login</button>
        </div>
    `;
}

function loadSignUp() {
    app.innerHTML = `
        <div class="container">
            ${topNav()}
            <h1>Sign Up for Hinder</h1>
            <form>
                <input type="text" placeholder="Full Name">
                <input type="email" placeholder="Email">
                <input type="password" placeholder="Password">
                <button type="button" onclick="loadProfileSetup()">Continue</button>
            </form>
            <button onclick="loadHome()">Back</button>
        </div>
    `;
}

function loadLogin() {
    app.innerHTML = `
        <div class="container">
            ${topNav()}
            <h1>Login to Hinder</h1>
            <form>
                <input type="email" placeholder="Email">
                <input type="password" placeholder="Password">
                <button type="submit">Login</button>
            </form>
            <button onclick="loadHome()">Back</button>
        </div>
    `;
}

function loadProfileSetup() {
    app.innerHTML = `
        <div class="container">
            ${topNav()}
            <h1>Profile Setup</h1>
            <form>
                <input type="text" placeholder="Occupation">
                <input type="date" placeholder="Birth Date">
                <input type="tel" placeholder="Phone Number">
                <button type="button" onclick="loadPreferences()">Next</button>
            </form>
            <button onclick="loadSignUp()">Back</button>
        </div>
    `;
}

function loadPreferences() {
    app.innerHTML = `
        <div class="container">
            ${topNav()}
            <h1>Set Your Preferences</h1>
            <form>
                <label>Housing Type:</label>
                <select>
                    <option>Apartment</option>
                    <option>House</option>
                    <option>Shared Room</option>
                </select>
                <label>Budget Range:</label>
                <input type="number" placeholder="Enter Budget">
                <button type="button" onclick="loadSwipe()">Start Matching</button>
            </form>
            <button onclick="loadProfileSetup()">Back</button>
        </div>
    `;
}

function loadSwipe() {
    showNav(); // Show navigation buttons on the swiping page
    app.innerHTML = `
        <div class="container swipe-container">
            ${topNav()}
            <h1>Swipe to Match</h1>
            <div class="swipe-card">
                <p>Example Listing</p>
                <button>Like</button>
                <button>Dislike</button>
            </div>
            <button onclick="loadPreferences()">Back</button>
        </div>
    `;
}

function loadProfile() {
    app.innerHTML = `
        <div class="container">
            ${topNav()}
            <h1>Tenant Profile</h1>
            <input type="file" id="profilePic" accept="image/*">
            <input type="text" placeholder="Name">
            <input type="number" placeholder="Age">
            <textarea placeholder="About Me"></textarea>
            <textarea placeholder="What I'm Looking For"></textarea>
            <input type="text" placeholder="Interests">
            <button onclick="loadHome()">Save & Back</button>
        </div>
    `;
}

function loadMessages() {
    app.innerHTML = `
        <div class="container">
            ${topNav()}
            <h1>Messages</h1>
            <div class="message-box">
                <p>No messages yet.</p>
            </div>
            <button onclick="loadHome()">Back</button>
        </div>
    `;
}

function loadSavedListings() {
    app.innerHTML = `
        <div class="container">
            ${topNav()}
            <h1>Saved Listings</h1>
            <div class="saved-listing">
                <p>No saved listings yet.</p>
            </div>
            <button onclick="loadHome()">Back</button>
        </div>
    `;
}

function loadSettings() {
    app.innerHTML = `
        <div class="container">
            ${topNav()}
            <h1>Settings</h1>
            <p>Coming Soon...</p>
            <button onclick="loadHome()">Back</button>
        </div>
    `;
}

// Top navigation buttons
function topNav() {
    return `
        <div class="top-nav">
            <button class="circle-btn" onclick="loadProfile()">👤</button>
            <button class="circle-btn" onclick="loadMessages()">💬</button>
            <button class="circle-btn" onclick="loadSavedListings()">📌</button>
            <button class="circle-btn" onclick="loadSettings()">⚙️</button>
        </div>
    `;
}

// Load the home page by default
loadHome();
