import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import '../style/ManagePaddockContainer.css';
import PaddockInfo from '../components/PaddockInfo';

class ManagePaddockContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Manage Paddocks",
            paddock: null
        };
    }

    componentDidMount() {
        const id = this.props.match.params.id;
        const url = `http://localhost:8080/paddocks/${id}`;

        fetch(url)
            .then(res => res.json())
            .then(paddock => this.setState({
                paddock: paddock
            }))
            .catch(err => console.error);
    }

    render() {
        return (
            <div className="container">

                <PaddockInfo paddock={this.state.paddock}/>
                <button className="buttons" type="feed">Feed</button>
            </div>
        )
    }
}

export default ManagePaddockContainer;
