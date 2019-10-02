import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import '../style/ManagePaddockContainer.css';
import PaddockCardList from '../components/PaddockCardList';

class ManagePaddockContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Manage Paddocks",
            paddocks: []
        };
    }

    componentDidMount() {
        const url = "http://localhost:8080/parks/paddocks";

        fetch(url)
            .then(res => res.json())
            .then(paddocks => this.setState({
                paddocks: paddocks
            }))
            .catch(err => console.error);
    }

    render() {
        return (
            <div className="container">
                <PageTitleBar className="title" title={this.state.title}/>
                <h1>Manage Paddock Container</h1>
                <PaddockCardList paddocks={this.state.paddocks}/>
            </div>
        )
    }
}

export default ManagePaddockContainer;
