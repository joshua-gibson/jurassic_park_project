import React from 'react';
import Sound from 'react-sound';
import '../style/HeaderContainer.css'

const ErrorPage = () => (
    <div className="container">
    <h1>404 - Page Not Found!</h1>
    <img className="dennis" src="https://i.gifer.com/5bp.gif" alt="dennis"/>
 

    <Sound
   url="http://wavcentral.com/sounds/movies/jurassic/jurass01.mp3"
   playStatus={Sound.status.PLAYING}
   onLoading={this.handleSongLoading}
   onPlaying={this.handleSongPlaying}
   onFinishedPlaying={this.handleSongFinishedPlaying}
   />
    </div>
)

export default ErrorPage;