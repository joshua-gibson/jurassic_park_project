import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardHeader from '@material-ui/core/CardHeader';
import CardMedia from '@material-ui/core/CardMedia';
import CardContent from '@material-ui/core/CardContent';
import Avatar from '@material-ui/core/Avatar';
import Typography from '@material-ui/core/Typography';
import { red } from '@material-ui/core/colors';
import Icon from '@material-ui/core/Icon';



const useStyles = makeStyles(theme => ({
  card: {
    maxWidth: 345,
    margin: "20px"
  },
  media: {
    height: '276px',
    width: '100%',
    objectFit: 'contain'
  },
  avatar: {
    backgroundColor: red[500],
    },
      root: {
        '& > span': {
          margin: theme.spacing(2),
        },
      },
      iconHover: {
        '&:hover': {
          color: red[800],
        },
      },
    }));



export default function LabCard(props) {
  const classes = useStyles();

  const paddockoptions = props.paddocks.map((paddock, index) => {
    return <option key={index} value={paddock.id}>{paddock.name}</option>
  })

  function handleSubmit(){

    props.sns(props.species);
    props.hs();

  }



  return (
    <Card className={classes.card}>
      <CardHeader 
      avatar=<Avatar 
      aria-label="DinosaurCard" 
      className={classes.avatar}>
           {props.avatar}
          </Avatar>

        title={props.name}
        subheader={props.subheader}
      />
      <CardMedia
        className={classes.media}
        image={props.image}
        component="img"
      />
   <CardContent>
        <Typography variant="body2" color="textSecondary" component="p" >{props.content}
</Typography>
    </CardContent>
    <div className={classes.root}>
      
    </div>

            <form>
                <label>Name: </label>
            <input onChange={props.snn} type="text" name="name"/> <br/>
            <label>Name: </label>
            <select onChange={props.snp}>
            <option key="99" value="None">None</option>
                {paddockoptions}
            </select> 
            <br/>
            <Icon onClick={handleSubmit} >add_circle</Icon>
            {/* <input onClick={handleSubmit} type="submit" value="Submit"></input> */}
            </form> 

            

    </Card>

  );
}
