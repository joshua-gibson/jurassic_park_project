import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import PaddockFilterForm from '../components/PaddockFilterForm'
import DinoCardList from '../components/DinoCardList'
import '../style/ManagePaddockContainer.css';

class ManageDinosContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Manage Dinosaurs",
            dinosaurs: [],
            paddocks: []
        };
        this.filterByPaddock=this.filterByPaddock.bind(this);
    }

    getDinos(){
        const url = "http://localhost:8080/dinosaurs";
        fetch(url)
        .then(res => res.json())
        .then(dinosaurs => this.setState({dinosaurs: dinosaurs}))
        .catch(err => console.error);
    }

    componentDidMount() {
        
        this.getDinos();
        const url2 = "http://localhost:8080/parks/paddocks";

        fetch(url2)
        .then(res => res.json())
        .then(paddocks => this.setState({
            paddocks: paddocks
        }))
        .catch(err => console.error);
    }

    filterByPaddock(paddockID){
        this.getDinos();
        const url = `http://localhost:8080/paddocks/${paddockID}/dinosaurs`;
        console.log(url)
        fetch(url)
        .then(res => res.json())
        .then(res => res._embedded.dinosaurs)
        .then(res => res.map((dino) => dino.id))
        .then(res => res.map((id) => this.state.dinosaurs.find(x => x.id === id)))
        .then(res => this.setState({dinosaurs: res}))
        .catch(err => console.error)
    }

    render() {
        return (
            <div className="container">
                <PageTitleBar className="title" title={this.state.title}/>
                <PaddockFilterForm filterByPaddock={this.filterByPaddock} paddocks={this.state.paddocks}/>
                <DinoCardList dinosaurs={this.state.dinosaurs}/>

            </div>
        )
    }
}

export default ManageDinosContainer;