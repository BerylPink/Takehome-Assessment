import React, { Component } from 'react';
import './App.css';
import axios from 'axios';

class App extends Component {

  constructor() {
    super();
  
    this.state = {
       tweets: []
    }
  }

  hashTagSearch(e) {

    axios.get('https://api.twitter.com/1.1/search/tweets.json')
    .then(res => {
      let tweets = res.data;
      console.log(tweets);

      let data = e.target.value;
      let filteredTweets = tweets.filter(data => {
        return data === this.state.tweets.entities.hashtags;
      });

      this.setState({tweets: filteredTweets});

    })
    .then(err => console.log(err));

  }
  
  render() {
    const listTweets = this.state.tweets;
    return (
      <div className="container">
        <div className="flex-header">
          <div className="header"><h2>Twitter Tool</h2></div>
        </div>

        <div className="tweets">
          <input onChange={this.hashTagSearch} type="search" />
          {listTweets.map(list => {
            return(
              <div className="list-tweets">
                <p>{list}</p>
              </div>
            )
          })}
        </div>

      </div>

    );
  }
}

export default App;