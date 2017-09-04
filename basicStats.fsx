open System

let filename = fsi.CommandLineArgs.[1];
let lines = System.IO.File.ReadLines(filename);

let parsedLines = lines
                |> Seq.map(fun x -> x.Replace(";",";\n"))
                |> Seq.map(fun x -> x.Split('\n'))
                |> Seq.concat
                |> Seq.map(fun x -> x.Trim(' '))

Seq.length parsedLines |> printfn "%d"
parsedLines |> Seq.iter (printfn "%A")

  
