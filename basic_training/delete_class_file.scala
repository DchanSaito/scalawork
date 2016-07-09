val filesHere = (new java.io.File(".")).listFiles
for (
  file <- filesHere
  if file.isFile
  if file.getName.endsWith(".class")
) file.delete
