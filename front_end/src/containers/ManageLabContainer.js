import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import LabCardList from '../components/LabCardList'
import '../style/ManagePaddockContainer.css';

class ManageLabContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Dinosaur Lab",
            dinosaurs: [],
            paddocks: [],
            newName: null,
            newPaddock: null,
            newSpecies: null
        };
        this.handleSubmit = this.handleSubmit.bind(this);
        this.setNewName = this.setNewName.bind(this);
        this.setNewPaddock = this.setNewPaddock.bind(this);
        this.setNewSpecies = this.setNewSpecies.bind(this);
    }

    componentDidMount() {
        const url = "http://localhost:8080/species";
        const url2 = "http://localhost:8080/parks/paddocks";

        fetch(url)
        .then(res => res.json())
        .then(dinosaurs => this.setState({dinosaurs: dinosaurs}))
        .catch(err => console.error);

        fetch(url2)
        .then(res => res.json())
        .then(paddocks => this.setState({
            paddocks: paddocks
        }))
        .catch(err => console.error);
    }

    handleSubmit(){
        // event.preventDefault();
          const subData =   {
            "name": `${this.state.newName}`,
            "paddock": `http://localhost:8080/paddocks/${this.state.newPaddock}`,
            "species": `http://localhost:8080/species/${this.state.newSpecies}`
          };
    
          fetch('http://localhost:8080/dinosaurs', {
           method: 'POST',
           body: JSON.stringify(subData),
           headers: {'Content-Type': 'application/json'}
          })
          .catch(err => console.error);
      }

      setNewName(evt){
          const name = evt.target.value
        this.setState({newName: name});
      }

      setNewPaddock(evt){
        const paddock = evt.target.value
        this.setState({newPaddock: paddock});
      }

      setNewSpecies(species){
        this.setState({newSpecies: species});
        this.handleSubmit();
      }

    render() {
        return (
            <div className="container">
                <PageTitleBar className="title" title={this.state.title}/>
                <LabCardList hs={this.handleSubmit} snn = {this.setNewName} snp = {this.setNewPaddock} sns = {this.setNewSpecies} dinosaurs={this.state.dinosaurs} paddocks={this.state.paddocks}/>

            </div>
        )
    }
}

export default ManageLabContainer;